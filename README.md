# TODO-LIST-SPRINGBOOT


### API OVERVIEW

1. GET - /tasks - retireves all tasks and displays them - no parametes - return tasks(view)
2. POST -/tasks - Creates a new task with a given title- title (String, in requestparam) - Redirect to/tasks
3. POST - /tasks/{id}/update -Updates the title of an existing task- id (Path), title (String) - Redirect to / tasks
4. GET - /tasks/{id}/delete - Deletes a specific task by ID - id (Path)- Redirect to / tasks
5. GET - /tasks/{id}/toggle - toggles the completed status of a task -	id(Path) - Redirect to /tasks


