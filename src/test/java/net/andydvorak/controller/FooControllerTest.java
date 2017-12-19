package net.andydvorak.controller;

import net.andydvorak.model.Foo;
import net.andydvorak.service.FooService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
/*
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("file:/webapp")
@ContextConfiguration("file:/webapp/WEB-INF/applicationContext.xml")
*/
public class FooControllerTest{

    @InjectMocks
    FooController testController;

    @Autowired
    FooService fooService;

    private MockMvc mockMvc;
    private static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

    @Before
    public void setup() {

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
       // this.mockMvc = standaloneSetup(testController).build();

    }

    @Test
    public void testCreateSignupFormInvalidUser() throws Exception {

//        when(fooService.getAll()).thenReturn(new ArrayList<Foo>());
               // .thenThrow(new InvalidUserException("For Testing"));

        this.mockMvc.perform(get("/test")
                .contentType(APPLICATION_JSON_UTF8));

    }

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {

        // assert statements
        assertEquals("10 * 0 = 0 ",0,testController.multiply(10,0));

    }

    @Test
    public void testMultiply() {
        assertEquals("10 x 5 must be 50", 50, testController.multiply(10, 5));
    }


/*
    public void firstTest() {
        assertEquals(1,1);
    }

    @BeforeClass
    public static void m1(){
        System.out.print("this method will run  before all test ");
    }
    @Before
    public void m2(){
        System.out.print("this method will run  before each test ");    }

*/
    /*
    @Test
    public void checkAssert(){
        assertEquals("1 is equal to 1",1,1);
        assertEquals(1,1);
        assertTrue("it will retrun true",1==1);
        assertTrue(2==2);
        assertFalse("will return false",1==2);
        assertFalse(1==2);
        assertNull("will retrun Null ","new Integer()");
        assertNotEquals(1,3);
    }
  */

}