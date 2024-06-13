var contextRootPath = "";

function BuzaRouter(url) {
    var $frmBUZACommon = $("#frmBUZACommon");
    if($frmBUZACommon.length < 1) {
        $frmBUZACommon = $("<form/>").attr({id:"frmBUZACommon", method:'GET'});
        $(document.body).append($frmBUZACommon);
    }
    $frmBUZACommon.empty();
    $frmBUZACommon.attr('target', '_self');
    $frmBUZACommon.attr('action', contextRootPath + url);

    $frmBUZACommon.submit();
}