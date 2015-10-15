package es.upm.miw.pd.ecp1.command.memetablecalculator;

import upm.jbb.IO;
import es.upm.miw.pd.ecp1.command.calculator.AddCommand;
import es.upm.miw.pd.ecp1.command.calculator.Calculator;
import es.upm.miw.pd.ecp1.command.calculator.CommandManager;
import es.upm.miw.pd.ecp1.command.calculator.PrintCommand;
import es.upm.miw.pd.ecp1.command.calculator.ResetCommand;
import es.upm.miw.pd.ecp1.command.calculator.SubtractCommand;

public class MainMementableCalculator {
	
    private CommandManager commandManager;

    public MainMementableCalculator() {
        Calculator calculator = new MementableCalculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new UndoCommand(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainMementableCalculator());
    }
}
