package top.gaoyuanwang.intelligenceagriculture.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Route {
    private Integer RouteId;
    private Integer userId;
    private String startTime;
    private String endTime;
    private Double startLongitude;
    private Double startLatitude;
    private Double endLongitude;
    private Double endLatitude;
    private List<Record> records;

    @Data
    @NoArgsConstructor
    static public class Record{
        private Integer RecordId;
        private Integer RouteId;
        private String time;
        private Double longitude;
        private Double latitude;
    }
}
