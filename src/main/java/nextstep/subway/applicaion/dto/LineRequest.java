package nextstep.subway.applicaion.dto;

import nextstep.subway.domain.SectionRequest;

public class LineRequest {
    private String name;
    private String color;
    private Long upStationId;
    private Long downStationId;
    private Integer distance;

    public LineRequest() {

    }
    private LineRequest(String name, String color, Long upStationId, Long downStationId, Integer distance) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public static LineRequest of(String name, String color, Long upStationId, Long downStationId, Integer distance) {
        return new LineRequest(name, color, upStationId, downStationId, distance);
    }


    public static LineRequest of(String name, String color) {
        return new LineRequest(name, color, null, null, null);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public Integer getDistance() {
        return distance;
    }

    public SectionRequest toSectionRequest() {
        return SectionRequest.of(upStationId, downStationId, distance);
    }

}
