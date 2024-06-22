// $(function(){
//     $("#divLoading").show();
// });


const contextRootPath = "";
const { createApp } = Vue;

function BuzaRouter(url) {
    let $frmBUZACommon = $("#frmBUZACommon");
    if($frmBUZACommon.length < 1) {
        $frmBUZACommon = $("<form/>").attr({id:"frmBUZACommon", method:'GET'});
        $(document.body).append($frmBUZACommon);
    }
    $frmBUZACommon.empty();
    $frmBUZACommon.attr('target', '_self');
    $frmBUZACommon.attr('action', contextRootPath + url);

    $frmBUZACommon.submit();
}


$(document).ready(function() {
    $("#divLoading").show();
    var showLeftNav = false;
    var showProfile = false;

    function toggleProfile() {
        showProfile = !showProfile;
        if (showProfile) {
            // $("#divProfile").fadeIn(200);
            $("#divProfile").slideDown(200);
        } else {
            $("#divProfile").fadeOut(200);
        }
    }

    function handleOutsideClick(event) {
        if (showProfile && !$(event.target).closest('.profile').length) {
            showProfile = false;
            $("#divProfile").fadeOut(200);
        }
    }

    $(document).on('click', handleOutsideClick);

    $("#btnProfileToggle").on('click', function(event){
        event.stopPropagation();
        toggleProfile();
    });

    $("#btnCloseMobileSideBar").on('click', function(event){
        event.stopPropagation();
        $("#divMobileSidebar").hide(200);
    });

    $("#btnOpenMobileSideBar").unbind('click').click(function(){
        $("#divMobileSidebar").show(200);
    });

});

$(window).on('load', function(){
    $("#divLoading").css('display','none');
});

