<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Insert title here</title>
  </head>
  <body>
    <form action="/table" method="get">
      <div>
        <label for="sum">Сумма кредита: </label>
        <input type="number" name="sum" id="sum" step="0.01" required min="100000" max="5000000">
      </div>
      <div>
        <label for="monts">Срок кредита в месяцах: </label>
        <input type="number" name="monts" id="monts" required min="12" max="60">
      </div>
      <div>
        <label for="percent">Годовая процентная ставка в %: </label>
        <input type="number" name="percent" id="percent" step="0.1" required min="12.9" max="23.9">
      </div>
      
      <div>
        <input type="submit" value="Расчитать">
      </div>
    </form>
  </body>
</html>