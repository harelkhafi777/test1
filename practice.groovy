//find install plugins
def pluginList = new ArrayList(Jenkins.instance.pluginManager.plugins)
pluginList.sort { it.getShortName() }.each{
  plugin -> 
    println ("${plugin.getDisplayName()} (${plugin.getShortName()}): ${plugin.getVersion()}")
}

// find all the jobs
Jenkins.instance.getAllItems(AbstractItem.class).each {
    println it.fullName 
};