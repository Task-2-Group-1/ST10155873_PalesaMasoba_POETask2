
import static com.mycompany.loginclass.LoginClass.input;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author masob
 */
public class Task2 {
 int var = 0;
private String taskName;
private String taskDescription;
private int taskNumber;
private String developerDetails;
private int taskDuration;
private String taskID;
private String taskStatus;





public boolean checkTaskDescription(){
    //Ensures that task description meets the requirements
String taskDescription = null;
for(int i=0; i<=taskDescription.length(); i++){
    if(taskDescription.length()<=50){
System.out.println("Please enter task description");
taskDescription = input.nextLine();


    }
    return true;
}
    return false;

}
public static String createTaskID(){
    //Gets the task ID together
    String taskName = ":";
    String developerDetails = ":";
    int taskNumber;
    developerDetails = developerDetails.substring(0,2);
    taskName = taskName.substring(3,5);
    taskNumber = taskNumber.length()-3;
    task ID = taskID.toUppercase();
    
    return null;
}




public static String printTaskDetails(){
    //Prints out the details of the task
  String taskDetails;
  String taskDetails = "taskName\n + taskNumber\n + taskDescription\n + taskDeveloperDetails\n"
          "+ taskID + taskStatus\n + taskDuration";
          
    return null;
}

    /**
     *
     * @return
     */
public static int returnTotalHours(){
// Sums up the total number of hours
return 0;
int totalNumberOfHours;
totalNumberOfHours = sum int(taskDuration);

    }
return sum taskDuration; 
}    
                

        
       

 