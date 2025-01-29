package main.AuthTemplate;


import main.AuthTemplate.apiPayload.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class testController {

    @GetMapping()
    public ApiResult<?> test() {
        return ApiResult.onSuccess("test성공");
    }

}
