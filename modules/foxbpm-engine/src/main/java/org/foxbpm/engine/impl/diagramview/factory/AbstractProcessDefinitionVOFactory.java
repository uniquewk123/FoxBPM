/**
 * Copyright 1996-2014 FoxBPM ORG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author MAENLIANG
 */
package org.foxbpm.engine.impl.diagramview.factory;

import java.util.List;

import org.foxbpm.engine.impl.entity.ProcessDefinitionEntity;
import org.foxbpm.engine.task.Task;

/**
 * 创建流程图形对象的抽象工厂
 * 
 * @author MAENLIANG
 * @date 2014-06-10
 * 
 */
public abstract class AbstractProcessDefinitionVOFactory implements
		FoxbpmProcessDefinitionVOFactory {
	/**
	 * 创建流程图，不包括标记信息
	 * 
	 * @param deployedProcessDefinition
	 * @return
	 */

	public abstract String createProcessDefinitionVOString(
			ProcessDefinitionEntity deployedProcessDefinition);

	/**
	 * 创建流程图，包括标记信息
	 * 
	 * @param processDefinitionKey
	 *            流程定义KEY
	 * @param notEndTask
	 *            没有完成的任务信息
	 * @param endTask
	 *            已经完成的任务信息
	 * @param deployedProcessDefinition
	 *            流程定义信息
	 * @return 包含标记的，流程图字符串
	 */
	public abstract String createProcessInstanceSVGImageString(
			List<Task> notEndTask,
			ProcessDefinitionEntity deployedProcessDefinition);

}