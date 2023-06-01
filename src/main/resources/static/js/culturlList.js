$.ajax({
    method: "GET",
    url: "/cultural",
    data: {},
    success: function (response) {
        let rows = response['culturalEventInfo']['row'];
        for(let i = 0; i<rows.length; i++) {
            let culture = rows[i];
            let codename = culture['CODENAME'];
            let usefee = culture['USE_FEE'];
            console.log(codename, usefee);
            $( "p" ).append( `<strong> ${codename} : ${usefee}<br> <strong>` );
        }
        console.log("-------------");
        console.log(response);
    }
})