function button_click() {
        // alert("ddd")
        // const con = document.getElementsByClassName("btn_modify");
        // const con1 = document.getElementsByClassName("modify");
        const con2 = document.getElementById("modify1")
        const con3 = document.getElementById("node")

        // const con2 = document.getElementsByClassName("unit")
        // const con3 = document.getElementsByClassName("modify")
        const nextNode = con3.nextSibling.nextSibling;
        console.log(nextNode);
        if (nextNode.style.display=='none') {        
            nextNode.style.display = 'block';
            con3.style.display = 'none';
        } else {
            nextNode.style.display = 'none';
            con3.style.display = 'block';
        }
    }

    function cancel() {
        const con2 = document.getElementById("modify1")
        const con3 = document.getElementById("node")
        // const cancel = document.getElementById("cancel_can")
        const prevNode = con2.previousSibling.previousSibling;
        console.log(prevNode);
        if(prevNode.style.display=='none') {
            prevNode.style.display = 'block';
            con2.style.display = 'none';
        } else {
            prevNode.style.display = 'none';
            con2.style.display = 'block';
        }

    }

    function button_click1() {
        const con4 = document.getElementById("node1")

        const nextNode1 = con4.nextSibling.nextSibling;

        if (nextNode1.style.display == 'none') {
                nextNode1.style.display = 'block';
                con4.style.display = 'none';
        } else {
            nextNode1.style.display = 'none';
            con4.style.display = 'block';
        }
    }

    function cancel1() {
        const con2 = document.getElementById("modify2")
        const con3 = document.getElementById("node1")
        // const cancel = document.getElementById("cancel_can")
        const prevNode = con2.previousSibling.previousSibling;
        console.log(prevNode);
        if(prevNode.style.display=='none') {
            prevNode.style.display = 'block';
            con2.style.display = 'none';
        } else {
            prevNode.style.display = 'none';
            con2.style.display = 'block';
        }

    }

    
    function button_click2() {
        const con4 = document.getElementById("node2")

        const nextNode1 = con4.nextSibling.nextSibling;

        if (nextNode1.style.display == 'none') {
                nextNode1.style.display = 'block';
                con4.style.display = 'none';
        } else {
            nextNode1.style.display = 'none';
            con4.style.display = 'block';
        }
    }

    function cancel2() {
        const con2 = document.getElementById("modify3")
        const con3 = document.getElementById("node2")
        // const cancel = document.getElementById("cancel_can")
        const prevNode = con2.previousSibling.previousSibling;
        console.log(prevNode);
        if(prevNode.style.display=='none') {
            prevNode.style.display = 'block';
            con2.style.display = 'none';
        } else {
            prevNode.style.display = 'none';
            con2.style.display = 'block';
        }

    }

    function button_click3() {
        const con4 = document.getElementById("node3")

        const nextNode1 = con4.nextSibling.nextSibling;

        if (nextNode1.style.display == 'none') {
                nextNode1.style.display = 'block';
                con4.style.display = 'none';
        } else {
            nextNode1.style.display = 'none';
            con4.style.display = 'block';
        }
    }

    function cancel3() {
        const con2 = document.getElementById("modify4")
        const con3 = document.getElementById("node3")
        // const cancel = document.getElementById("cancel_can")
        const prevNode = con2.previousSibling.previousSibling;
        console.log(prevNode);
        if(prevNode.style.display=='none') {
            prevNode.style.display = 'block';
            con2.style.display = 'none';
        } else {
            prevNode.style.display = 'none';
            con2.style.display = 'block';
        }

    }