package org.eclipse.lsp4e.typescript;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.lsp4e.languages.InitializeLaunchConfigurations;
import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;

public class TypeScriptLanguageServer extends ProcessStreamConnectionProvider {

	public TypeScriptLanguageServer() {
		List<String> commands = new ArrayList<>();
		commands.add(InitializeLaunchConfigurations.getNodeJsLocation());
		commands.add("C://Users//azerr//git//javascript-typescript-langserver/lib/language-server-stdio.js");
		commands.add("--trace");
		String workingDir = "C://Users//azerr//git//javascript-typescript-langserver/lib";
		setCommands(commands);
		setWorkingDirectory(workingDir);
	}

	@Override
	public String toString() {
		return "TypeScript Language Server: " + super.toString();
	}
	
	
	
}
