package seedu.addressbook.commands;

import seedu.addressbook.TextUi;
import seedu.addressbook.Utils;
import seedu.addressbook.model.AddressBook;
import seedu.addressbook.model.person.ReadOnlyPerson;

import java.util.List;

import static seedu.addressbook.TextUi.LS;

/**
 * Terminates the program.
 */
public class ExitCommand implements Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Exits the program."
            + LS + "Example: " + COMMAND_WORD;

    private TextUi ui;

    public ExitCommand() {}

    @Override
    public void injectDependencies(TextUi ui, AddressBook addressBook, List<? extends ReadOnlyPerson> relevantPersons) {
        this.ui = ui;
    }

    @Override
    public CommandResult execute() {
        Utils.assertNotNull(ui);
        ui.showGoodbyeMessage();
        System.exit(0);
        throw new InternalError(); // should never reach this line.
    }
}
