package uz.pdp.springsecuritywithspringboot.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
@Setter
public class AppErrorDTO {
    private String errorMessage;
    private String errorPath;
    private String errorCode;
    private LocalDateTime timestamp;

    public AppErrorDTO(String errorMessage, String errorPath, String errorCode) {
        this.errorMessage = errorMessage;
        this.errorPath = errorPath;
        this.errorCode = errorCode;
        this.timestamp = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Tashkent")));
    }
}
