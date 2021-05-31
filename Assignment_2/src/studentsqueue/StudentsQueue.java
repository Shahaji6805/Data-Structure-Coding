package studentsqueue;

import java.util.Arrays;

public class StudentsQueue {

	private Student[] queue;
	int front;
	int rear;

	public StudentsQueue() {
		queue = new Student[5];
		front = rear = -1;
	}

	public StudentsQueue(int size) {
		queue = new Student[size];
		front = rear = -1;
	}

	public void insert(Student s) {
		if (front == 0 && rear == queue.length - 1) {
			System.out.println("Queue is full");
		} else 
		{
			if (front == -1 && rear == -1) {
				front = rear = 0;
				queue[rear] = s;
			} else {
				rear = rear + 1;
				queue[rear] = s;

			}
		}
	}

	public Student remove() {
		Student temp = null;
		if (front == -1 && rear == -1) {
			System.out.println("Queue is empty");
		} else {
			if (front == rear) {
				temp = queue[front];
				front = rear = -1;
			} else {
				temp = queue[front];
				front = front + 1;
			}
		}
		return temp;
	}

	/*
	 * @Override public String toString() { return "StudentsQueue [queue=" +
	 * Arrays.toString(queue) + ", front=" + front + ", rear=" + rear + "]"; }
	 */

	
	  public String toString() { String str = "\n";
	  str=str+"front="+front+" "+"rear="+rear+"\n"; if (front ==-1 && rear==-1) {
	  System.out.println("Queue is empty");
	  
	  }
	  
	  for (int i = front; i <= rear; i++) {
	  
	  if(front==-1) break; str = str + queue[i] + "\n"; } str=str+"\n"; return str;
	  }
	 
	
	
}
