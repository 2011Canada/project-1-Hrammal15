<h1>Employee Reimbursement System (ERS)</h1>
<h3>Project Description</h3>
The Expense Reimbursement System (ERS) will manage the process of reimbursing employees for expenses incurred while on company time. All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement.

<h3>Technologies Used</h3>
  <li> Java 8 </li>
  <li> JavaScript ES6 </li>
  <li> HTML5</li>
  <li> CSS</li>
  <li> PostgreSQL 13.1 </li>

  





<h3>Features</h3>
<li> Both Employees and Managers can login using the same login page! </li>
<li> Employees can submit a request for reimbursement under (Food, Travel, Lodging, Other) </li>
<li> Managers can approve/deny any ticket8 </li>

<h2>Getting Started</h2>

git clone command:
git clone https://github.com/2011Canada/project-1-Hrammal15.git

Requires Java version 8
https://www.oracle.com/ca-en/java/technologies/javase-downloads.html

Requires DBeaver
https://dbeaver.io/download/

Requires RDS on AWS
https://aws.amazon.com/

<h3>Step 1:</h3>
<li>Start Java server</li>
<h3>Step 2:</h3>
<li>Connect to database using DBeaver</li>
<h3>Step 3:</h3>
<li>Run the included ERSScript on your database</li>
<h3>Step 4:</h3>
<li>Go to http://localhost:8080/ERS/login.html in a Chrome incognito tab</li>
<h3>Step 5:</h3>
<li>Login using one of the username and passwords provided in ERSScript</li>
Usage
Login as either an Employee or as a Manager
Employee can apply for reimbursement
Employee can view all personal past tickets
Employee can logout
Manager can view all tickets (both current and past)
Manager can approve/decline tickets through the use of the ticket's ID number
Manager can filter by ticket status (approved, pending, denied)
Manager can logout
