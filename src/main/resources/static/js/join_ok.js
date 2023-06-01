function double_check(){

    const prId = document.getElementById('prId');

    $('.nick_input').change(function () {
        // $('#id_check_sucess').hide();
        // $('.id_overlap_button').show();
        $('.nick_input').attr("check_result", "fail");
    })

    // if ($('.nick_input').val() == '') {
    //     alert('닉네임을 입력해 주세요')
    //     return;
    // }

    $.ajax({
        url:'/idCheck'
        ,type:'POST'
        ,data:{
            "prNick":nick.value
        }
        ,success:function (data){
            console.log(data);
            if(data){
                alert("사용가능한 닉네임입니다")
                $('.nick_input').attr("check_result", "success");
                // checkBtn.disabled = true;
            }
            else {
                alert("중복된 닉네임입니다")
                nick.focus();
                // checkValue.value("");
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert("ERROR : " + textStatus + " : " + errorThrown);
        }
    })

}