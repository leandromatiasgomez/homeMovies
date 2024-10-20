function eliminateMovie(id){
	swal({
	  title: "Are you sure?",
	  text: "Once deleted, you will not be able to recover this movie!",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((YES) => {
	  if (YES) {
		$.ajax({
			url:"/deleteMovie/"+id,
			success: function(res){
				console.log(res);
			},
		});
	    swal("Poof! Your movie has been deleted!", {
	      icon: "success",
	    }).then((yes) => {
			if(yes){
				location.href="/listMovie";
			}
		});
	  } else {
	    swal("The movie is safe!");
	  }
	});
}