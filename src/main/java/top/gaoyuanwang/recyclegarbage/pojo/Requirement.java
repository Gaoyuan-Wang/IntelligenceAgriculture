package top.gaoyuanwang.recyclegarbage.pojo;

import lombok.Data;

@Data
public class Requirement {
    private Integer requirementId;
    private String product;
    private Integer amount;
    private String location;
    private String deadline;
    private String appointTime;
    private Integer userId;
}
