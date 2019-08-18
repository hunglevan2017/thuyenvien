

function init_chart_doughnut() {
    if ("undefined" != typeof Chart && ( $(".canvasDoughnut").length)) {
    	
    	var a;

    	
    	var chuc_danh_text=[];
    	var chuc_danh_color=[];
    	var chuc_danh_total=[];
		$.ajax({url: $("#PageContext").val() + "getSumCrew", success: function(response){

	        
	        $.each(response, function(index, value){
	        	chuc_danh_text.push(value.chucdanh_text); 
	        	chuc_danh_color.push(value.color); 
	        	chuc_danh_total.push(value.total);
             });
	        console.log(chuc_danh_text);
	        console.log(chuc_danh_color);
	        console.log(chuc_danh_total);
	        
	        var a = {
		            type: "doughnut",
		            tooltipFillColor: "rgba(51, 51, 51, 0.55)",
		            data: {
		                labels: chuc_danh_text,
		                datasets: [{
		                    data: chuc_danh_total,
		                    backgroundColor: chuc_danh_color,
		                    hoverBackgroundColor: ["#CFD4D8", "#B370CF", "#E95E4F", "#36CAAB", "#49A9EA"]
		                }]
		            },
		            options: {
		                legend: !1,
		                responsive: !1
		            }
		        };
			
	    	
	    	
	         
	        $(".canvasDoughnut").each(function() {
	            var b = $(this);
	            new Chart(b, a)
	        })
	        
	    }});
		
		
    }
}
$(document).ready(function() {
     init_chart_doughnut();
     $('#TitlePage').text( $("a.active p").text() );
});


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
    }
];

function initDateByMe(id) {
    $('#' + id).daterangepicker({
        singleDatePicker: true,
        locale: {
            format: 'DD/MM/YYYY'
        }
    });
}

function getFormData($form) {
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i) {
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
}

function popupModalAdd(url) {
    $.ajax({
        type: 'GET',
        url: url,
        beforeSend: function() {},
        error: function(error) {
            console.log(error);
        },
        success: function(data) {
            //console.log(data);
            //alert(data);
            //console.log(data);
            $('#modal-confirm').html(data);
            $('#modal-confirm').modal('show');
        },
        complete: function() {
            // alert(1);
        }
    });
}

function initEventClickForEditOrDelete(table, css_class, url) {
    $('#' + table).on("click", css_class, function() {
        var id = $(this).attr('data-id');
        popupModalAdd(url + id);
    });
}


function replaceAll(str, find, replace) {
    return str.replace(new RegExp(find, 'g'), replace);
}

function trimObj(obj) {
    if (!Array.isArray(obj) && typeof obj != 'object') return obj;
    return Object.keys(obj).reduce(function(acc, key) {
        acc[key.trim()] = typeof obj[key] == 'string' ? obj[key].trim() : trimObj(obj[key]);
        return acc;
    }, Array.isArray(obj) ? [] : {});
}

function ConvertFormToJSON(form) {
    var array = jQuery(form).serializeArray();
    var json = {};

    jQuery.each(array, function() {
        json[this.name] = this.value || '';
    });

    return json;
}

function formatDate(data) {
    var date = new Date(data);
    var month = date.getMonth() + 1;
    var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
    return day + "/" + (month > 9 ? month : "0" + month) + "/" + date.getFullYear();
}

function initTable(idDiv, idTable) {
    var html = "";
    html += ' <table id="' + idTable + '"';
    html += ' 	class="table table-striped table-bordered dataTable no-footer jambo_table bulk_action"';
    html += ' 	style="width: 100%">';
    html += ' 	<thead></thead>';
    html += ' </table>';
    $('#' + idDiv).html(html);

}

function getLastParameterOnURL() {
    var pageURL = window.location.href;
    return pageURL.substr(pageURL.lastIndexOf('/') + 1);
}

function initTableInformation(data,element) {
    var aoData = [
    	{"mData": null,"defaultContent": ""},
    	{"mData": "id","defaultContent": ""},
        {"mData": "hoten","defaultContent": ""},
        {"mData": "text","defaultContent": ""},
        {"mData": "nghenghiep","defaultContent": ""},
        {"mData": "dienthoai","defaultContent": ""},
        {"mData": "diachi","defaultContent": ""},
        {"mData": "congty","defaultContent": ""},
        {"mData": null,"defaultContent": ""},
        {"mData": null,"defaultContent": ""}
    ];

    var columnDefs = [
    	{"title": "STT","targets": 0},
        {"targets": 1,"visible": false,"searchable": false},
        {"title": "Họ tên","targets": 2,"className": "dt-left","width": "20%"},
        {"title": "Quan hệ","targets": 3,},
        {"title": "Nghề nghiệp","targets": 4,"visible": false,"searchable": false},
        {"title": "Điện thoại","targets": 5},
        {"title": "Địa chỉ","targets": 6},
        {"title": "Năm sinh","targets": 7},
        {"title": "","targets": 8,
            "render": function(data, type, row, meta) {
                return '<button type="button" class="dt-button btn btn-success source  information-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';
            }
        },
        {"title": "","targets": 9,
            "render": function(data, type, row, meta) {
                return '<button type="button" class="dt-button btn btn-success source  information-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';
            }
        },
        {"className": "dt-center","targets": "_all"}
    ];

    return (element.DataTable({
        data: data,
        "columnDefs": columnDefs,
        "aoColumns": aoData,
        "bInfo": false,
        "bPaginate": false,
        "searching": false,
        "fnRowCallback": function(nRow, aData, iDisplayIndex) {
            var index = iDisplayIndex + 1;
            $('td:eq(0)', nRow).html(index);
            return nRow;
        },
        "createdRow": function(row, data, dataIndex, full) {
            $(row).attr('data-id', data.id);
        }

    }));
}