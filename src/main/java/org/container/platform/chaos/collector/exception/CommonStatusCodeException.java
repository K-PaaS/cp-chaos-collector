package org.container.platform.chaos.collector.exception;

import java.io.Serial;

/**
 * Container Platform Exception Model 클래스
 *
 * @author Luna
 * @version 1.0
 * @since 2024-08-30
 **/
public class CommonStatusCodeException extends BaseBizException {
	@Serial
	private static final long serialVersionUID = -1288712633779609678L;

	public CommonStatusCodeException(String errorMessage) {
		super(errorMessage);
	}
}
