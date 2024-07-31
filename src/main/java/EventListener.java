import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class EventListener implements GLEventListener {
	@Override
	public void init(GLAutoDrawable glAutoDrawable) {
		System.out.println("Hello World");
	}
	
	@Override
	public void dispose(GLAutoDrawable glAutoDrawable) {
	
	}
	
	@Override
	public void display(GLAutoDrawable glAutoDrawable) {
	
	}
	
	@Override
	public void reshape(GLAutoDrawable glAutoDrawable , int i , int i1 , int i2 , int i3) {
	
	}
}