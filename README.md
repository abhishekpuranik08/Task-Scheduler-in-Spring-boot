This project contains code for scheduling tasks using cron expressions. Cron expressions provide a powerful and flexible way to schedule jobs, allowing tasks to be executed at specific times or intervals.

in the Code i have used the Expression like spring.schedule.everyDay1 which tells when should the Scheduler run basically like the time on which the task needs to be Executed.You can define that in your Application.Proprty file Spring boot Application 
spring.schedule.everyDay1=*/10 * * * * ?
Lets break it down the Expression 

BreakDown by Position 
Seconds (*/10): The task will run every 10 seconds within each minute.
Minutes (*): The task will run every minute.
Hours (*): The task will run every hour.
Day of Month (*): The task will run every day.
Month (*): The task will run every month.
Day of Week (?): This position is ignored (? is used as a placeholder).

So you can clearly understand that the this task will be scheduled for every 10 minutes.

 
