package study.mockito;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoStudy {

    @Test
    public void mockitoOrgIntroducingExample() {

        //1. verify interactions
        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.clear();
        verify(mockedList).add("one");//try add("two"), add(any(String.class))
        verify(mockedList, times(1)).clear();

        //2. stub method calls
        LinkedList mockedList2 = mock(LinkedList.class);
        when(mockedList.get(0)).thenReturn("first");

        MyListHolder spyList = spy(new MyListHolder(Arrays.asList(1, 2, 3, 5, 4)));
        int repeat = 5;
        for (int i = 0; i < repeat; i++)
            spyList.add(6);
        verify(spyList, times(repeat)).add(any(Integer.class));
    }
}
