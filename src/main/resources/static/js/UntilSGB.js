


var btnjs = [{
		  extend: "copy",
		  className: "btn-sm"
		},
		{
		  extend: "csv",
		  className: "btn-sm"
		},
		{
		  extend: "excel",
		  className: "btn-sm"
		},
		{
		  extend: "pdfHtml5",
		  className: "btn-sm"
		},
		{
		  extend: "print",
		  className: "btn-sm"
		}];
function initDateByMe(id)
{
	$('#' + id).daterangepicker(
			{
		        singleDatePicker: true,
		        locale: {
		            format: 'DD/MM/YYYY'
		        }
		    }		
	);
}

function getFormData($form){
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
}

function popupModalAdd(url) {
	$.ajax({
		type : 'GET',
		url : url,
		beforeSend : function() {
		},
		error : function(error) {
			console.log(error);
		},
		success : function(data) {
			//console.log(data);
			//alert(data);
			//console.log(data);
			$('#modal-confirm').html(data);
			$('#modal-confirm').modal('show');
		},
		complete : function() {
			// alert(1);
		}
	});
}
function initEventClickForEditOrDelete(table,css_class,url)
{
	$('#' + table).on("click", css_class, function () {
		 var id =  $(this).attr('data-id');
		 popupModalAdd ( url + id );
	});
}


function replaceAll(str, find, replace) {
	return str.replace(new RegExp(find, 'g'), replace);
}
function trimObj(obj) {
	  if (!Array.isArray(obj) && typeof obj != 'object') return obj;
	  return Object.keys(obj).reduce(function(acc, key) {
	    acc[key.trim()] = typeof obj[key] == 'string'? obj[key].trim() : trimObj(obj[key]);
	    return acc;
	  }, Array.isArray(obj)? []:{});
}
function ConvertFormToJSON(form){
    var array = jQuery(form).serializeArray();
    var json = {};
    
    jQuery.each(array, function() {
        json[this.name] = this.value || '';
    });
    
    return json;
}

function formatDate(data)
{
	var date = new Date(data);
	var month = date.getMonth() + 1;
	var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate() ;
	return  day +  "/" + (month > 9 ? month : "0" + month) + "/" + date.getFullYear();
}
function initTable(idDiv,idTable)
{
	var html ="";
	html +=  ' <table id="' + idTable + '"';
	html +=  ' 	class="table table-striped table-bordered dataTable no-footer jambo_table bulk_action"';
	html +=  ' 	style="width: 100%">';
	html +=  ' 	<thead></thead>';
	html +=  ' </table>';
	$('#'+idDiv).append(html);
	
}
