/*
 * Copyright 2013 JBoss by Red Hat.
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
 */
package org.kie.config.cli.command.impl;

import org.kie.config.cli.CliContext;
import org.kie.config.cli.command.CliCommand;

public class ExitCliCommand implements CliCommand {
	
	@Override
	public String getName() {
		
		return "exit";
	}

	@Override
	public String execute(CliContext context) {
		context.getWeld().shutdown();
		
		System.exit(0);
		return null;
	}

}
