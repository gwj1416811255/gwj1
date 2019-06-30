package org.gaoweijian.commons.processors;

import org.gaoweijian.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}
