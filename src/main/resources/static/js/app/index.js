var main = {
    init : function () {
        var _this = this;
        $("#btn-code-insert").on("click",function(){
            _this.save();
        });

        $("#btn-code-update").on('click', function () {
            _this.update();
        });

        $("#btn-code-delete").on('click', function () {
            _this.delete();
        });
    },
    save : function () {
        var data = {
            code_cd: $("#code-cd").val(),
            code_nm: $("#code-nm").val(),
            code_yn: $("#code-yn").val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/code/save',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function (){
            alert('코드가 등록 되었습니다.');
        }).fail(function (error){
            alert(JSON.stringify(error));
            console.log(typeof(JSON.stringify(error)))
        });
    },

    update : function () {
        var data = {

        }
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
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: {id_list:id_list}
        }).done(function (){
            alert("삭제 되었습니다.");
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    }
};

main.init();