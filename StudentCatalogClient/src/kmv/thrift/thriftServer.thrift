# This will set the generated java class
# in kmv.thrift package
namespace java kmv.thrift

service ThriftWebServer {
	void addStudent(1:list<string> studentModel),

	void removeStudent(1:list<string> studentModel),

	bool updateStudent(1:list<string> studentTerms,
	                   2:list<bool> studentTermsFlags),

	list<list<string>> findStudents(1:list<string> studentTerms,
                                    2:list<bool> studentTermsFlags),

	void findRemoveStudents(1:list<string> studentTerms,
                            2:list<bool> studentTermsFlags),

	i32 getStudentCount(),

	list<string> getStudentAtIndex(1:i32 index),

	void saveChanges()
}