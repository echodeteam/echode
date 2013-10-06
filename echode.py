import os
version = "0.1"
build_pyver = "2.7.3"
print os.getcwd()
print "Welcome to ECHODE version " + version + ", built for Python version " + build_pyver
 
runAllowed = "false"

def run():
    total = "5"
    command = raw_input("-> ")
    
    command0 = command.split()[0]
    if command == "help":
        print "List of commands:"
        print "about ----------------------------------- Gives some info about ECHODE"
        print "help ---------------------------------------------- Lists all commands"
        print "kill ---------------------------------------- Quits the ECHODE console"
        print "time <all|weekday|date> --------------------------- Gives current time"
        print "version -------------------------------- Writes current EHCODE version"
        print ""
        print "Total commands: " + total
        run()
    elif command == "about":
        print "You are using ECHODE version " + version
        print "Made by Erik Konijn, 2013"
        run()
    elif command == "version":
        print version
        run()
    elif command0 == "time":
        import datetime
        date = str(datetime.datetime.now().date())
        try:
            from datetime import datetime
            time = datetime
            if command.split()[1] == "all":
                print time.now()
            elif command.split()[1] == "weekday":
                now = datetime.now()
                print now.strftime('%A')
            elif command.split()[1] == "date":
                print date
        except Exception:
            print "Usage: 'time <all|weekday|date>'"
        run()
    elif command == "kill":
        exit()
    else:
        print "'" + command + "' is not a valid command\nTo see all commands, type 'help'."
        run()
 
run()
