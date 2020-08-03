package com.xc.justforjoy.controller;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
public class DeferredResultQueue {

	private static Queue<DeferredResult<Object>> queue = new ConcurrentLinkedQueue<DeferredResult<Object>>();
	
	public static void save(DeferredResult<Object> deferredResult) {
		queue.add(deferredResult);
	}
	
	public static DeferredResult<Object> get() {
		return queue.poll();
	}
}
