import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		  return students;
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
                
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		     try
			 {
             if(index<0 || index>students.length)
            {
               throw IllegalArgumentException;
            }
             else{
              students;
	          }
			  

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
     try{	
	if(index>0 ||index>=students.length || student==NULL)
		{
		     throw IllegalArgumentException;
	    }
	else{
	     students[index]=student;
		}
		}
		catch(Exception e)
		{
		   System.out.println(e);
		 }
}
		
	    

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
           if(student==NULL){
            throw IllegalArgumentException;
           }
           else{
            students[0]=student;
           }
		}
		catch(Exception e)
		{
			   System.out.println(e);
	    }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		  try{
           if(student==NULL){
            throw IllegalArgumentException;
           }
           else{
              students[students.length]=student;
	        }
			}
			catch(Exception e)
			{
			   System.out.println(e);
			 }
        }  

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		   try{
           if(student==NULL){
            throw IllegalArgumentException;
           }
           else{
              students[index]=student;
           }
		   }
		   catch(Exception e)
		   {
		      System.out.println(e);
			}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		   try{
           if(student==NULL){
            throw IllegalArgumentException;
           }
           else{
              students[index]=null;
			  for(i=index;i<students.length;i++)
			  {
				  students[i]=students[i++];
			  
           }
		   }
		   catch(Exception e)
		   {
		      System.out.println(e);
			}
                 
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int x=0;
		for(int j=0;j<students.length;j++)
		{
		if(students[j]==student)
		{
		   x=x+1;
		   student[j]=null;
		 for(int i=index;i<student.length-1;i++)
		 {
		     students[i]=students[i+1];
		  }
		  break;
		}
	}
	if(x==1)
	{
	try{
	throw IllegalArgumentException;
	  }
	  catch(Exception e)
	  {
	   System.out.println(e);
	  }
		  
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try{
			if(students==null)
			{
				throw IllegalArgumentException;
			}
			else if(index<0 && index>=students.length)
			{
				for(i=index;i<=length;i++)
				{
					students[index]=null;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
	    }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try{
			if(students==null)
			{
				throw IllegalArgumentException;
			}
			else{
				for(i=0;i<students.length;i++)
				{
					if(students[i]==student)
					{
						for(j=i+1;j<students.length;j++)
						{
							students[j]=null;
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
