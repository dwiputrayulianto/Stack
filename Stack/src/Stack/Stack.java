package Stack;
import java.lang.reflect.Array;
/**
 *
 * @author dwipu
 */
public class Stack <T> {
  public T[]array;
  public int pointer;
  public Stack(Class<?> classname){
  array=(T[]) Array.newInstance(classname, 10);

  pointer = -1;
  }

  public void push(T item){
  array[++pointer]=item;
  }
  public T pop(){
  return array[pointer--];
  }

  public static void main(String[] args){
  Stack<Integer> a = new Stack<Integer>(Integer.class);
  a.push(5);
  a.push(6);
  a.push(7);

  System.out.println(a.pop());
  System.out.println(a.pop());
    
    }
    
}
