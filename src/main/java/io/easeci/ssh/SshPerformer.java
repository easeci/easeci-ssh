package io.easeci.ssh;

import io.easeci.extension.command.Command;
import io.easeci.extension.command.Directive;
import io.easeci.extension.directive.CodeChunk;

import java.util.List;

public class SshPerformer implements Directive {

    @Override
    public String getDirectiveName() {
        return null;
    }

    @Override
    public List<Command> getAvailableCommandList() throws IllegalAccessException {
        return null;
    }

    @Override
    public CodeChunk provideCode(String parameters) throws IllegalAccessException {
        return null;
    }
}
