/**
 * 
 */

 $(document).ready(function() {
        $('[type*="radio"]').change(function () {
          var me = $(this);
        });
        $('select').material_select();
        $.validator.setDefaults({
          ignore: []
        });
        $("form").validate({
          submitHandler: function(form) {
            alert("Thank you for Feedback");
            return true;
            
          },
          errorElement: 'div',
          errorPlacement: function(error, element) {
            var placement = $(element).data('error');
            if (placement) {
              $(placement).append(error)
            } else {
              error.insertAfter(element);
            }
          }
        });
      });