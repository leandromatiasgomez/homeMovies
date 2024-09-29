function eliminate(id){
	swal({
	  title: "Are you sure?",
	  text: "Once deleted, you will not be able to recover this imaginary file!",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((YES) => {
	  if (YES) {
		$.ajax({
			url:"/deleteUser/"+id,
			success: function(res){
				console.log(res);
			},
		});
	    swal("Poof! Your imaginary file has been deleted!", {
	      icon: "success",
	    }).then((yes) => {
			if(yes){
				location.href="/listUser";
			}
		});
	  } else {
	    swal("Your imaginary file is safe!");
	  }
	});
}
