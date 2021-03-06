var main = {
    init : function () {
        var _this = this;
        // left_table -------
        $("#btn-code-save").on("click",function(){
            _this.save();
        });

        $("#btn-code-add").on('click', function () {
            _this.add();
        });

        $("#btn-code-delete").on('click', function () {
            _this.delete();
        });
        //------------------------------------
        // right_table --------------------
        $("#btn-dtl-add").on('click', function () {
            _this.dtl_add();
        });
        $("#btn-dtl-delete").on('click', function () {
            _this.dtl_delete();
        });
        $("#btn-dtl-save").on('click',function () {
            _this.dtl_save();
        })
    },
    save : function () {
        var values = [];
        var rowCount = $("#left_table tr").length;
        var tr = '';
        for(var i = 1;i<rowCount;i++){
            tr = $("#left_table tr:eq('"+i+"')")
            var tdMap = new Object();
            tdMap.check_code = tr.find("td:eq('0') input").val();
            tdMap.code_nm = tr.find("td:eq('1') input").val();
            tdMap.code_cd = tr.find("td:eq('2') input").val();
            tdMap.code_yn = tr.find("td:eq('3') input").val();
            values.push(tdMap);
        }
        console.log(values);
        $.ajax({
            type: 'POST',
            url: '/api/code/save',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(values)
        }).done(function (){
            alert('코드가 등록 되었습니다.');
            window.location.href = '/min-erp';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    },

    add : function () {
        var tr = "<tr>" +
                 "<td><input type='checkbox' id='check_code' name='check_code' value=''></td>" +
                 "<td><input type='text' id='code-nm' name='code-nm' value=''></td>" +
                 "<td><input type='text' id='code-cd' name='code-cd' value=''></td>" +
                 "<td><input type='text' id='code-yn' name='code-yn' value=''></td>" +
                 "</tr>";
        $("#left_table").append(tr);
    },
    dtl_add : function () {
        var tr ="<tr>" +
                 "<td><input type='checkbox' id='code-dtl-check' name='code-dtl-check' value=''></td>" +
                 "<td><input type='text' id='code-dtl-cd' name='code-dtl-cd' value=''></td>" +
                 "<td><input type='text' id='code-dtl-nm' name='code-dtl-nm' value=''></td>" +
                 "<td><input type='text' id='code-dtl-yn' name='code-dtl-yn' value=''></td>" +
                 "<td><input type='text' id='code-dtl-gt01' name='code-dtl-gt01' value=''></td>" +
                 "<td><input type='text' id='code-dtl-gt02' name='code-dtl-gt02' value=''></td>" +
                 "<td><input type='text' id='code-dtl-gt03' name='code-dtl-gt03' value=''></td>" +
                 "</tr>";
        $("#right_table").append(tr);
    },

    delete : function () {
        var id_list = [];
        $('input[name=check_code]:checked').each(function (){
            id_list.push($(this).val()*1);
        });
        if(id_list==0){
            alert("삭제할 코드를 선택해주세요.");
            return false;
        }
        console.log(id_list);
        $.ajax({
            type: 'DELETE',
            url: '/api/code/delete',
            data: {"id_list":id_list}
        }).done(function (){
            window.location.href = '/min-erp';
            alert("삭제 되었습니다.");
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    },

    dtl_delete : function () {
        var ids = [];
        $('input[name=code-dtl-check]:checked').each(function (){
            ids.push($(this).val()*1);
        });
        if(ids==0){
            alert("삭제할 코드를 선택해주세요.");
            return false;
        }
        $.ajax({
            type: 'DELETE',
            url: '/api/dtl/delete',
            data: {"ids":ids}
        }).done(function (){
            window.location.href = '/min-erp';
            alert("삭제 되었습니다.");
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    },

    dtl_save : function () {
        var values = [];
                var rowCount = $("#right_table tr").length;
                var tr = '';
                for(var i = 1;i<rowCount;i++){
                    tr = $("#right_table tr:eq('"+i+"')")
                    var tdMap = new Object();
                    tdMap.code_dtl_check = tr.find("td:eq('0') input").val();
                    tdMap.code_dtl_cd = tr.find("td:eq('1') input").val();
                    tdMap.code_dtl_nm = tr.find("td:eq('2') input").val();
                    tdMap.code_dtl_yn = tr.find("td:eq('3') input").val();
                    tdMap.code_dtl_flag01 = tr.find("td:eq('4') input").val();
                    tdMap.code_dtl_flag02 = tr.find("td:eq('5') input").val();
                    tdMap.code_dtl_flag03 = tr.find("td:eq('6') input").val();
                    values.push(tdMap);
                }
                console.log(values);
                $.ajax({
                    type: 'POST',
                    url: '/api/dtl/save',
                    contentType: 'application/json; charset=utf-8',
                    data: JSON.stringify(values)
                }).done(function (){
                    alert('코드가 등록 되었습니다.');
                    window.location.href = '/min-erp';
                }).fail(function (error){
                    alert(JSON.stringify(error));
                });
    }
};

main.init();