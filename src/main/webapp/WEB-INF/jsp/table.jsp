<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
  	Сумма кредита: ${sum}
  	Срок кредита в месяцах: ${monts}
  	Годовая процентная ставка: ${percent}%
    <table border="1">
      <tr>
        <th>Номер платежа</th>
        <th>Месяц/Год</th>
        <th>Платеж по основному долгу</th>
        <th>Платеж по процентам</th>
        <th>Остаток основного долга</th>
        <th>Общая сумма платежа</th>
      </tr>
        <c:forEach items="${payments}" var="payment">
          <tr>
            <td>${payment.getN()}</td>
            <td>${payment.getMonthYear()}</td>
            <td>${payment.getMainPay()}</td>
            <td>${payment.getPercentPay()}</td>
            <td>${payment.getRest()}</td>
            <td>${payment.getSumPay()}</td>
          </tr>
        </c:forEach>
    </table>
</body>
</html>