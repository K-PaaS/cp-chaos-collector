package org.container.platform.chaos.collector.common.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * ChaosResourcesList 클래스
 *
 * @author Luna
 * @version 1.0
 * @since 2024-09-05
 */
@Data
@Builder
public class ChaosResourcesList {
    private String resultCode;
    private String resultMessage;
    private Integer httpStatusCode;
    private String detailMessage;
    private CommonItemMetaData itemMetaData;
    private List<ChaosResource> items;

    public ChaosResourcesList() {

    }

    public ChaosResourcesList(String resultCode, String resultMessage, Integer httpStatusCode, String detailMessage, CommonItemMetaData itemMetaData, List<ChaosResource> items) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.httpStatusCode = httpStatusCode;
        this.detailMessage = detailMessage;
        this.itemMetaData = itemMetaData;
        this.items = items;
    }
}
