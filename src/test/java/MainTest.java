import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;
import com.pooya.entity.dto.data.GoodsInInventoryDataDto;
import com.pooya.entity.dto.data.InventoryTransactionData;
import com.pooya.entity.entity.InventoryTransaction;
import com.pooya.entity.entity.QuantityUnit;
import com.pooya.service.data.GoodsInInventoryDataService;
import com.pooya.service.data.InventoryTransactionDataService;
import com.pooya.service.service.InventoryTransactionService;
import com.pooya.service.service.QuantityUnitService;
import com.pooya.web.controller.QuantityUnitController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import java.util.*;

public class MainTest {

    public static void main(String[] args) {
       /* BeanFactory context = new ClassPathXmlApplicationContext("/META-INF/applicationcontext.xml");
        QuantityUnitService service = context.getBean(QuantityUnitService.class);
        //QuantityUnitController controller = context.getBean(QuantityUnitController.class);
        //controller.getQuantityUnitModel().getQuantityUnitDtos();

        List<QuantityUnitDto> dto = new ArrayList<QuantityUnitDto>();
        Map<String,Object> map = new HashMap<>();
        dto = service.find(map);

        dto.forEach(x-> System.out.println(x.toString()));*/

    }
}


