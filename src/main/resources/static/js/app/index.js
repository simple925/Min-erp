var main = {
    init : function () {
        var _this = this;
        $("#btn-code-insert").on("click",function(){
            _this.save();
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
//            data: data
        }).done(function (){
            alert('코드가 등록 되었습니다.');
//            window.location.href = '/min-erp';
        }).fail(function (error){
            alert(JSON.stringify(error));
            console.log(typeof(JSON.stringify(error)))
        });
    }
}

main.init();