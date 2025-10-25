package sec04_getProperties;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        System.out.println("OS 이름 : " + osName);

        String userName = System.getProperty("user.name");
        System.out.println("user 이름 : " + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("user 이름 : " + userHome);
        //Property를 얻어내어 Set객체 생성하여 KeySet으로 저장후 출력
        // Properties컬렉션은 hashTable을 상속받았기 때문에 Map계열이다.
        // 키 값만 가져와서 Set컬렉션을 만들고 출력해본다. 왜냐 map 계열은 키값만 알아도
        // 값을 얻어오는데 문제가 없기 때문인 것이다.)
        Properties properties = System.getProperties();

        Set<Object> Keys = properties.keySet();

        for (Object object : Keys){
            if (object instanceof String){
                String key = (String) object;
                System.out.println("["+key+"] : " + System.getProperty(key));
            }
        }
    }
}
