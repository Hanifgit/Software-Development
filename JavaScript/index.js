var len = document.querySelectorAll("#btn").length;

for(var i=0;i<len ;i++){
    document.querySelectorAll("#btn")[i].addEventListener("click",function(){
	     var text = this.innerHTML;

	     switch(text){
	     	case "Play One":
	     	  document.querySelectorAll("#btn")[0].classList.add("para-style");
	     	  RemoveStyle(0);
	     	  break;

	     	case "Play Two":
	     	  document.querySelectorAll("#btn")[1].classList.add("para-style");
	     	  RemoveStyle(1);
	     	  break;

	     	case "Play Three":
	     	  document.querySelectorAll("#btn")[2].classList.add("para-style");
	     	  RemoveStyle(2);
	     	  break;
	     }
    });
}

function RemoveStyle(id){
	setTimeout(function(){
        document.querySelectorAll("#btn")[id].classList.remove("para-style");
	},1000);
}
