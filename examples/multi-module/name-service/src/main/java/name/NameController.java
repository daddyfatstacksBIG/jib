package name;

import common.SharedUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

  @RequestMapping("/")
  public String getText() {
    return "Jib Multimodule: " + SharedUtils.getText();
  }
}
