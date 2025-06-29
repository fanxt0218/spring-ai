/*
 * Copyright 2023-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.chat.memory;

import java.util.List;

import org.springframework.ai.chat.messages.Message;

/**
 * A repository for storing and retrieving chat messages.
 *
 * @author Thomas Vitale
 * @author Xiaotong Fan
 * @since 1.0.0
 */
public interface ChatMemoryRepository {

	List<String> findConversationIds();

	List<Message> findByConversationId(String conversationId);

	/**
	 * Replaces all the existing messages for the given conversation ID with the provided
	 * messages.
	 */
	void saveAll(String conversationId, List<Message> messages);

	void deleteByConversationId(String conversationId);

	/**
	* Deletes all the conversation IDs.
	*/
	void deleteConversationIds();
}
