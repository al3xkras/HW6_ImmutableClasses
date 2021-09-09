import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.alexkras.Group;
import ua.alexkras.ImmutableStudent;

public class ImmutableStudentTest {
    static ImmutableStudent immutableStudent1,
                            immutableStudent2,
                            immutableStudent3,
                            immutableStudent4,
                            immutableStudent5;

    @BeforeClass
    public static void before(){
        int age = 10;
        immutableStudent1 = new ImmutableStudent("Andrew", age, Group.group1);
        immutableStudent2 = new ImmutableStudent("Andrew", age,Group.group2a);
        immutableStudent3 = new ImmutableStudent("Andrew", age,Group.group1);
        immutableStudent4 = new ImmutableStudent("Andrew", age+10,Group.group1);
        immutableStudent5 = new ImmutableStudent("Ivan", age+10,Group.group1);
    }

    @Test
    public void testEquals1(){
        Assert.assertNotEquals(immutableStudent1, immutableStudent2);
    }

    @Test
    public void testEquals2(){
        Assert.assertEquals(immutableStudent1, immutableStudent3);
    }

    @Test
    public void testEquals3(){
        Assert.assertNotEquals(immutableStudent1, immutableStudent4);
    }

    @Test
    public void testEquals4(){
        Assert.assertNotEquals(immutableStudent4, immutableStudent5);
    }

}
