package test;

import photorganizer.*


/**
 * Created by Вадик on 08.01.2016.
 */
class GetPicsListTest extends GroovyTestCase {
    void testGetPicsList() {
        File  path= new File("g://Test");
        PicsList list = new PicsList();
        File[] files =  new File(String.valueOf(path)).listFiles();

            for(File file:files){
                list.setPicsList(file);
                System.out.println(file.toString());
            }

        assertNotNull(list.toString());

    }
}
