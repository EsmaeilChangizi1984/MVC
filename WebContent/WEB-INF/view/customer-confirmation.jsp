<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
      <title>Customer Confirmation Page</title>
</head>
<body>
The Customer is Confirmed :${customer.firstName} ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}
<br><br>
Postal Code: ${customer.postalCode}
</body>
</html>