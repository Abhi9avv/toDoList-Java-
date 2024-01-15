import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "WakeUp at 9:00 AM";
    String toDo2 = "Take Bath";
    String toDo3 = "Eat BreakFast";
    String toDo4 = "Attend Class From 9:30 AM TO 4:30 PM ";
    String toDo5 = "Go Gym at 6:00 PM";
    String toDo6 = "Eat Dinner at 8:00 PM";
    String toDo7 = "Sleep at 9:00 PM";
    
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    toDoList.add(toDo4);
    toDoList.add(toDo5);
    toDoList.add(toDo6);
    toDoList.add(toDo7);
    

    for (String toDo : toDoList) {
        System.out.println(toDo);
    }
  }
}
