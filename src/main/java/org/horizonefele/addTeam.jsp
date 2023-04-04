<form:form modelAttribute="team" action="/teams/add" method="post">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <form:errors path="name" cssClass ="error"/>
    <form:label path="budget">Budget</form:label>
    <form:input path="budget" />
    <input type="submit" value="Save"/>
</form:form>