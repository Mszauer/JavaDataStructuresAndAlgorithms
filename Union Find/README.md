# Union-Find
A set of algorithms for solving dynamic conductivity problems.

Union command:
	Connect two objects.

Find / Connected Query:
	Is there a path connecting the two objects?

We assume "is connected to" is an equivalence relation that is the following:
	Reflexive:
		p is connected to p
	Symmetric:
		p is connected to q, then q is connected to p
	Transitive:
		p is connected to q, and q is connected to r, then p is connected to r
