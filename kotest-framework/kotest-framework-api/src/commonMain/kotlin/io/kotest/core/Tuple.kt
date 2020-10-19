package io.kotest.core

data class Tuple2<A, B>(val a: A, val b: B)
data class Tuple3<A, B, C>(val a: A, val b: B, val c: C)
data class Tuple4<A, B, C, D>(val a: A, val b: B, val c: C, val d: D)
data class Tuple5<A, B, C, D, E>(val a: A, val b: B, val c: C, val d: D, val e: E)
data class Tuple6<A, B, C, D, E, F>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F)
data class Tuple7<A, B, C, D, E, F, G>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G)
data class Tuple8<A, B, C, D, E, F, G, H>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H)
data class Tuple9<A, B, C, D, E, F, G, H, I>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I)
data class Tuple10<A, B, C, D, E, F, G, H, I, J>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J)
data class Tuple11<A, B, C, D, E, F, G, H, I, J, K>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K)
data class Tuple12<A, B, C, D, E, F, G, H, I, J, K, L>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L)
data class Tuple13<A, B, C, D, E, F, G, H, I, J, K, L, M>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M)
data class Tuple14<A, B, C, D, E, F, G, H, I, J, K, L, M, N>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N)
data class Tuple15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O)
data class Tuple16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P)
data class Tuple17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P, val q: Q)
data class Tuple18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P, val q: Q, val r: R)
data class Tuple19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P, val q: Q, val r: R, val s: S)
data class Tuple20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P, val q: Q, val r: R, val s: S, val t: T)
data class Tuple21<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P, val q: Q, val r: R, val s: S, val t: T, val u: U)
data class Tuple22<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V>(val a: A, val b: B, val c: C, val d: D, val e: E, val f: F, val g: G, val h: H, val i: I, val j: J, val k: K, val l: L, val m: M, val n: N, val o: O, val p: P, val q: Q, val r: R, val s: S, val t: T, val u: U, val v: V)


fun <A, B> tuple(a : A, b : B) = Tuple2(a, b)
fun <A, B, C> tuple(a : A, b : B, c : C) = Tuple3(a, b, c)
fun <A, B, C, D> tuple(a : A, b : B, c : C, d : D) = Tuple4(a, b, c, d)
fun <A, B, C, D, E> tuple(a : A, b : B, c : C, d : D, e : E) = Tuple5(a, b, c, d, e)
fun <A, B, C, D, E, F> tuple(a : A, b : B, c : C, d : D, e : E, f : F) = Tuple6(a, b, c, d, e, f)
fun <A, B, C, D, E, F, G> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G) = Tuple7(a, b, c, d, e, f, g)
fun <A, B, C, D, E, F, G, H> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H) = Tuple8(a, b, c, d, e, f, g, h)
fun <A, B, C, D, E, F, G, H, I> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I) = Tuple9(a, b, c, d, e, f, g, h, i)
fun <A, B, C, D, E, F, G, H, I, J> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J) = Tuple10(a, b, c, d, e, f, g, h, i, j)
fun <A, B, C, D, E, F, G, H, I, J, K> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K) = Tuple11(a, b, c, d, e, f, g, h, i, j, k)
fun <A, B, C, D, E, F, G, H, I, J, K, L> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L) = Tuple12(a, b, c, d, e, f, g, h, i, j, k, l)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M) = Tuple13(a, b, c, d, e, f, g, h, i, j, k, l, m)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N) = Tuple14(a, b, c, d, e, f, g, h, i, j, k, l, m, n)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O) = Tuple15(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P) = Tuple16(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P, q : Q) = Tuple17(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P, q : Q, r : R) = Tuple18(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P, q : Q, r : R, s : S) = Tuple19(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P, q : Q, r : R, s : S, t : T) = Tuple20(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P, q : Q, r : R, s : S, t : T, u : U) = Tuple21(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u)
fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> tuple(a : A, b : B, c : C, d : D, e : E, f : F, g : G, h : H, i : I, j : J, k : K, l : L, m : M, n : N, o : O, p : P, q : Q, r : R, s : S, t : T, u : U, v : V) = Tuple22(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v)
