package org.meiling.entity;

import java.util.Date;

public class Total {
	private int essaySize;
	private int discussSize;
	private int classifySize;
	private int labelSize;
	private int viewSize;
	private Date newTime;
	
	public Total() {
	}

	public Total(int essaySize, int discussSize, int classifySize,
			int labelSize, int viewSize, Date newTime) {
		super();
		this.essaySize = essaySize;
		this.discussSize = discussSize;
		this.classifySize = classifySize;
		this.labelSize = labelSize;
		this.viewSize = viewSize;
		this.newTime = newTime;
	}

	public int getEssaySize() {
		return essaySize;
	}

	public void setEssaySize(int essaySize) {
		this.essaySize = essaySize;
	}

	public int getDiscussSize() {
		return discussSize;
	}

	public void setDiscussSize(int discussSize) {
		this.discussSize = discussSize;
	}

	public int getClassifySize() {
		return classifySize;
	}

	public void setClassifySize(int classifySize) {
		this.classifySize = classifySize;
	}

	public int getLabelSize() {
		return labelSize;
	}

	public void setLabelSize(int labelSize) {
		this.labelSize = labelSize;
	}

	public int getViewSize() {
		return viewSize;
	}

	public void setViewSize(int viewSize) {
		this.viewSize = viewSize;
	}

	public Date getNewTime() {
		return newTime;
	}

	public void setNewTime(Date newTime) {
		this.newTime = newTime;
	}

	@Override
	public String toString() {
		return "Total [essaySize=" + essaySize + ", discussSize=" + discussSize
				+ ", classifySize=" + classifySize + ", labelSize=" + labelSize
				+ ", viewSize=" + viewSize + ", newTime=" + newTime + "]";
	}

	
}
